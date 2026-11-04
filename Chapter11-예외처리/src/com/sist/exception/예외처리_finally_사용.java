package com.sist.exception;
/*
 *    try
 *    {
 *       정상으로 수행하는 문장 => 실수/입력 : 오류발생의 문제 ==> 비정상 종료
 *    }catch(Exception e)
 *    {
 *       오류가 난 경우 처리하는 문장 => 에러메세지 볼 수 있다 
 *                                복구 => return
 *    }
 *    finally => 자원 관라가 없는 경우 => 생략 
 *    {
 *        정상 / 오류 => 무조건 수행된다 
 *        => 닫기 (파일 , 오라클 , 서버 닫기)
 *    }
 */
import java.io.*;
public class 예외처리_finally_사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
        try
        {
        	// CheckedException 
        	fr=new FileReader("C:\\Users\\vcand\\git\\java-study\\Chapter11-예외처리\\src\\com\\sist\\exception\\숫자야구게임.java");
            int i=0;
            while((i=fr.read())!=-1) // -1 => EOF
            {
            	System.out.print((char)i);
            }
        }catch(Exception ex)
        {
        	System.out.println(ex.getMessage());
        	// 에러 메세지 확인 
        }
        finally
        {
        	try
        	{
        		if(fr!=null)
        			fr.close();
        	}catch(Exception ex) {}
        }
	}

}




