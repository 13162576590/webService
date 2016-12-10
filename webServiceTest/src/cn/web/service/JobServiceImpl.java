package cn.web.service;

import javax.jws.WebService;

@WebService(endpointInterface = "cn.web.service.JobService")
public class JobServiceImpl implements JobService {

    @Override
    public String getJob() {
        return "JEE研发工程师|Android研发工程师|数据库工程师|前端工程师|测试工程师|运维工程师";
    }

    public void say() {
        System.out.println("早上好！");
    }

}
