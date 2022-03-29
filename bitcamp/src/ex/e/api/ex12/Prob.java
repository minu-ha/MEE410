package ex.e.api.ex12;

public class Prob {

    private static String getParameter(String url, String paramName) {

        int indexOfUrl = url.indexOf(paramName);
        int lastIndexOfUrl = url.lastIndexOf("&");

        String newUrl = url.substring(indexOfUrl,lastIndexOfUrl).replace(paramName,"");
        StringBuffer sbUrl = new StringBuffer(newUrl).deleteCharAt(0);

        return sbUrl.toString();
    }

    public static void main(String[] args) {

        String url1 = "http:/localhost/order?prodId=PROD-001&prodName=갤럭시3&price=980000";

        String prodName = getParameter(url1, "prodName");
        System.out.println("제품이름 : " + prodName);

        String url2 = "http:/localhost/registerUser?userId-USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
        String userAddress = getParameter(url2, "address");
        System.out.println("회원주소 : " + userAddress);
    }
}
