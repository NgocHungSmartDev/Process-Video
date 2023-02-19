package com.ngochung.previewvideo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PreviewController {

	@GetMapping({"/", "/preview"})
	public String getPreview() {
		return "preview";
	}
}
