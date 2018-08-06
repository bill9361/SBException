package cn.bill.sbexception.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: <br/>
 * Date:2018年8月6日 上午10:50:27 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */

@ControllerAdvice
public class ExceptionHandlerController
{
	
	@ExceptionHandler(value=Exception.class)
	public ModelAndView processException(Exception ex)
	{
		System.out.println("出错啦，进入注解方式获取全局异常");
		ModelAndView mv = new ModelAndView();
		mv.addObject("ex", ex.getMessage());
		mv.setViewName("error/error");
		return mv;
	}

}
