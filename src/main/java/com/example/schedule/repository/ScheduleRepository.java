package com.example.schedule.repository;

import com.example.schedule.Dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;

import java.util.List;
import java.util.Optional;

public interface ScheduleRepository {

    ScheduleResponseDto saveScedule(Schedule schedule);

    List<ScheduleResponseDto> findAllSchedules();

    Optional<Schedule> findScheduleById(Long id);

    Schedule findMemoByIdOrElseThrow(Long id);

    int updateSchedule(Long id, String contents, String author, String password);

    int updateTitle(Long id, String title, String password);

    int deleteSchedule(Long id);
}
