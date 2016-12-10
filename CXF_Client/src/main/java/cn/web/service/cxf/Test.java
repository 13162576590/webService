package cn.web.service.cxf;

public class Test {

    public static void main(String[] args) {
        LanguageManager ws = new LanguageManager();
        ILanguageService languageServicePort = ws.getILanguageServicePort();
        System.out.println(languageServicePort.getLanguage(1));
    }

}
