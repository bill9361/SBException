package cn.bill.sbexception.controller.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: 将所有错误映射到error,自己自定义实现ErrorController<br/>
 * Date:2018年8月6日 上午10:33:55 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
/*@Controller
@RequestMapping("/error")
public class BaseErrorController implements ErrorController
{

	@Override
	public String getErrorPath()
	{
		System.out.println("出错啦，进入自定义ErrorController");
		return "error/error";
	}
	
	@RequestMapping
	public String error()
	{
		return getErrorPath();
	}

}*/
