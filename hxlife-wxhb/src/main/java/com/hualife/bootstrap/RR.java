package com.hualife.bootstrap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.hualife.mesiframework.core.util.time.DateFormatUtil;
import com.hualife.wxhb.common.Constant;
import com.hualife.wxhb.service.GetMaxNo;

/** 
 * @author 吴培旭 
 * @description
 * @time 创建时间：2017年9月19日   
 */
public class RR {

	
	@Autowired
	private static GetMaxNo getMaxNo;
	public static void main(String[] args) throws IOException {
//		String pdfId = getMaxNo.getMaxNo();
		Date da = new Date();
//		Constant.OSS_PDF_PATH +
		String dateStr = DateFormatUtil.formatDate("yyyy/MM/dd/", da);
//		String ossPath =  "/" + "jand" + "/" + "1" + "/"+dateStr+".pdf";
		String ossPath = dateStr+"111"+".p1111";
		String oss;
		String ossPat = dateStr+"111"+".p1111";
		System.out.println(ossPath);
	}

}
