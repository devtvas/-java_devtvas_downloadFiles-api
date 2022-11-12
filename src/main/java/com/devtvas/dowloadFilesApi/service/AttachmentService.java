package com.devtvas.dowloadFilesApi.service;

import com.devtvas.dowloadFilesApi.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAttachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileId);
}
