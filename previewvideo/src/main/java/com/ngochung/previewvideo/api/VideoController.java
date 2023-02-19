package com.ngochung.previewvideo.api;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

	@GetMapping("/video")
	public byte[] getVideo() throws IOException {
		Resource resource = new ClassPathResource("static/sample.mp4");
		File file = resource.getFile();
		byte[] video = Files.readAllBytes(file.toPath());

		return video;
	}
}
