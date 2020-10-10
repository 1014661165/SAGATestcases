package G;

public class G3{
	
	private static int calcDangerDegree(){
        int dangerDegree = 0;
        double changePerInstance = Double.valueOf(Analyser.insModifyNum) / Analyser.insNumber;
        if(changePerInstance < Config.CPI)
            dangerDegree = 1;
        else if(Analyser.consistRatio < Config.lowCCP)
            dangerDegree = 1;
        else if(Analyser.averageConsisTimeInterval < Config.lowCCD * 24 * 60 * 60l)
            dangerDegree = 2;
        else if(Config.lowCCD * 24 * 60 * 60l <= Analyser.averageConsisTimeInterval && Analyser.averageConsisTimeInterval <= Config.highCCD * 24 * 60 * 60l)
            dangerDegree = 3;
        else if(Analyser.averageConsisTimeInterval > Config.highCCD * 24 * 60 * 60l)
            dangerDegree = 4;

        if(Analyser.bugsConsistCommitCount > 0 && Config.useBugInfo == 1)
            dangerDegree = 4;

        return dangerDegree;
    }
	
}