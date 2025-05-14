# 과제 진행하기
CH3 일정관리 앱 만들기

| 기능       | Metho | URL              | request | response  | 상태코드      |
|----------|------|------------------|---------|-----------|-----------|
| 일정 생성    | POST | /schedules       | 요청 body | 등록 정보     | 200: 정상등록 |
| 일정 전체 조회 | GET  | /schedules/{id}  | 요청 param | 다건 응답 정보  | 200: 정상조회 |
| 일정 단건 조회 | GET  | /schedules/{id}  | 요청 param | 단건응답 정보   | 200:정상조회  
| 일정 수정    | PUT  | /schedules/{id}  | 요청 body | 수정 정보     | 200:정상수정  |
| 일정 삭제    | DELETE | /schedules/{id}  | 요청 param | -         | 200:정상삭제  |
