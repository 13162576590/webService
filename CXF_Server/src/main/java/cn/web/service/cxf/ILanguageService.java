package cn.web.service.cxf;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName="languageManager")
public interface ILanguageService {

    public @WebResult(name="language")String getLanguage(@WebParam(name="position") int position);

}
