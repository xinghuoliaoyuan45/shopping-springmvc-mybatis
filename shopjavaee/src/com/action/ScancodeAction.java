package com.action;

import com.entity.Scanbarcode;
import com.service.ScanService;
import java.io.PrintStream;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScancodeAction {
	private ScanService scanService;

	@Resource(name = "scanService")
	public void setScanService(ScanService scanservice) {
		this.scanService = scanservice;
	}

	@RequestMapping({ "/Scancode/add" })
	public String addScancode(Scanbarcode scanbarcode) throws Exception {
		this.scanService.addScancode(scanbarcode);
		return "/scancode/success.jsp";
	}

	@RequestMapping({ "/Scancode/delete" })
	public String deleteScancode(String scancode) throws Exception {
		System.out.println(scancode);
		this.scanService.deleteScancode(scancode);
		return "/scancode/success.jsp";
	}
}
