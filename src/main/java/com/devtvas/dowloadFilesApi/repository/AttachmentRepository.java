package com.devtvas.dowloadFilesApi.repository;

import com.devtvas.dowloadFilesApi.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, String> {

}
