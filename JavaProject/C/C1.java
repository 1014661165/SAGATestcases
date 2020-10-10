package C;

public class C1 {
	
	/**
     * 将单个演化文件提取为列表
     * @param file 演化文件
     * @return
     * @throws IOException
     */
    public static List<CommitRecord> parse(int groupId, String file){
        try {
            List<CommitRecord> records = new ArrayList<>();
            List<String> lines = FileUtil.readLines(file);
            for (String line: lines) {
                String[] info = line.split(",");
                if (info.length < 10){
                    continue;
                }
                String realPath = info[0];
                int startLine = Integer.parseInt(info[1]);
                int endLine = Integer.parseInt(info[2]);
                int snippetStartLine = Integer.parseInt(info[3]);
                int snippetEndLine = Integer.parseInt(info[4]);
                String status = info[5];
                String commitId = info[6];
                String blobId = info[7];
                String commitTime = info[8];
                String submitter = info[9];
                String commitMessage = "";
                if (info.length == 11){
                    commitMessage = info[10];
                }else if (info.length > 11) {
                    String[] tmp = Arrays.copyOfRange(info, 10, info.length);
                    commitMessage = String.join(",", tmp);
                }
                CommitRecord record = new CommitRecord(groupId, startLine, endLine, snippetStartLine, snippetEndLine, blobId, commitId, commitTime, realPath, submitter, status, commitMessage);
                records.add(record);
            }

            Collections.sort(records, new Comparator<CommitRecord>() {
                @Override
                public int compare(CommitRecord o1, CommitRecord o2) {
                    return DateUtil.compare(o1.getDate(), o2.getDate());
                }
            });

            return records;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
	
}