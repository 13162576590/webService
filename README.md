# webService
webService+spring+cxf+maven

1.webServiceClient, webServiceTest,WeatherService学习demo
    项目发布后，根据生成相应的wsdl.xml打成jar文件(终端打包命令jar cvf ***.jar ./cn)，放在Client进行访问就可。


maven+spring+CXF

2.CXF_Client, CXF_Server用maven+spring+CXF集成
    如果项目是用Eclipse打开，不用Spring集成时，需要在java Bulid Path中Add Libray,选择Service Runtime，用tomcat即可(MyEclipse可忽略此步骤)
