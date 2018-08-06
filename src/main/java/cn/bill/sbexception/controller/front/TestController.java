package cn.bill.sbexception.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: <br/>
 * Date:2018年8月6日 上午10:25:44 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@Controller
@RequestMapping("/front")
public class TestController
{

	@RequestMapping("/test1.do")
	public void test1()
	{
		System.out.println("TestController...test1()");	
		int i = 10/0;
	}
}
