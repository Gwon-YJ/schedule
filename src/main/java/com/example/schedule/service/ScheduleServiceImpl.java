package com.example.schedule.service;

import com.example.schedule.Dto.ScheduleRequestDto;
import com.example.schedule.Dto.ScheduleResponseDto;
import com.example.schedule.entity.Schedule;
import com.example.schedule.repository.ScheduleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public ScheduleResponseDto saveSchedule(ScheduleRequestDto dto) {
        Schedule schedule = new Schedule(dto.getTitle(), dto.getContents(), dto.getAuthor(), dto.getPassword());

        return scheduleRepository.saveScedule(schedule);
    }

    @Override
    public List<ScheduleResponseDto> findAllSchedules() {
        List<ScheduleResponseDto> allSchedules = scheduleRepository.findAllSchedules();

        return allSchedules;
    }

    @Override
    public ScheduleResponseDto findScheduleById(Long id) {
//        // 일정 조회
//        Schedule schedule = scheduleRepository.findScheduleById(id);
//
//        // NPE 방지
//        if (schedule == null) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id = " + id);
//        }
//        // 필수값 검증
//        if (title == null || author == null) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The title is a required value.");
//        }
//
//        // 일정 수정
//        schedule.update(title, author);
//
//        return new ScheduleResponseDto(schedule);
        return null;
    }

    @Override
    public ScheduleResponseDto updateSchedule(Long id, String title, String author) {
//        // 일정 조회
//        Schedule schedule = scheduleRepository.findScheduleById(id);
//
//        // NPE 방지
//        if (schedule == null) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id = " + id);
//        }
//        // 필수값 검증
//        if (title == null || author == null) {
//            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The title is a required value.");
//        }
//
//        // 일정 수정
//        schedule.update(title, author);
//
//        return new ScheduleResponseDto(schedule);
        return null;
    }

    @Override
    public ScheduleResponseDto updateTitle(Long id, String title, String contents) {
        return null;
    }

    @Override
    public void deleteSchedule(Long id) {
        // 일정 조회
        int deleteRow = scheduleRepository.deleteSchedule(id);

        // 삭제된 row가 0개 라면
        if (deleteRow == 0) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Does not exist id = " + id);
        }
    }
}
