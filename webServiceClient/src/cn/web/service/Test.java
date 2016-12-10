package cn.web.service;

public class Test {

    public static void main(String[] args) {
        JobServiceImplService ws = new JobServiceImplService();
        JobService jobServiceImplPort = ws.getJobServiceImplPort();
        String jobs = jobServiceImplPort.getJob();
        String[] jobArray = jobs.split("\\|");
        System.out.println(jobArray[2]);
        System.out.println(jobArray[0]);
        System.out.println(jobArray[3]);
    }

}
