package io.pp.arcade.v1.admin.announcement.controller;

import io.pp.arcade.v1.admin.announcement.dto.AnnouncementAdminAddDto;
import io.pp.arcade.v1.admin.announcement.dto.AnnouncementAdminListResponseDto;
import io.pp.arcade.v1.admin.announcement.dto.AnnouncementAdminUpdateDto;
import javax.servlet.http.HttpServletRequest;
import org.apache.http.HttpResponse;
import org.springframework.web.bind.annotation.RequestParam;

public interface AnnouncementAdminController {
    public AnnouncementAdminListResponseDto announcementList(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "100") int size, HttpResponse httpResponse);
    public void announcementAdd(AnnouncementAdminAddDto addDto, HttpServletRequest request);
    public void announcementModify(AnnouncementAdminUpdateDto updateDto, HttpServletRequest request);
}
