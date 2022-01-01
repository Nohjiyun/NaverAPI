package naverapi;

import java.util.ArrayList;
import dto.NaverApiDTO;

//네이버 검색 API 예제 - blog 검색


//메인에 있는 네이버 API 소스들을 클래스를 만들어서 다 옮기고
//메인에서는 검색어만 전달하면 결과가 나오게 만들기

//맛집을 찾아주는 앱이라 생각하고 json 형식의 데이터로 받는데
//너무 복잡하네..
//제목, 링크, 날짜만 가져와서 보기 좋게 출력 해보자
//제목 : 여기 맛집
//링크 : https://sadkk
//날짜 : 20211129
//어렵지만 어떻게 해야될지 고민 또는 검색을 통해서 할 수 있느 사람은 해보기

public class MainClass {

 public static void main(String[] args) {
     NaverAPI nv = new NaverAPI();
     String responseBody = nv.searchBlog("코로나");
     System.out.println(responseBody);
     ArrayList<NaverApiDTO> list = nv.getListJson(responseBody);
     for(NaverApiDTO d: list) {
    	 System.out.print("제목: ");
    	 System.out.println(d.getTitle());
    	 System.out.print("링크: ");
    	 System.out.println(d.getLink());
    	 System.out.print("게시일: ");
    	 System.out.println(d.getpostdate());
     }
 }
}