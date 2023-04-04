import api.Api;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        String result = Api.executeGetRequest("http://api.openweathermap.org/data/2.5/forecast?id=524901&appid=d200f3cd6f06d1549a63dba04e482aab");
        System.out.println(result);
    }

}
