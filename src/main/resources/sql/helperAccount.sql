-- 테이블 생성
create table helperAccount
(
    id          varchar2(30) primary key, -- id
    pwd         varchar2(30) not null,    -- 비밀번호
    name        varchar2(30) not null,    -- 이름
    accountType varchar2(20) not null,    -- 계정 타입
    addr        varchar2(500),            -- 주소
    tel         varchar2(50),             -- 전화번호
    gender      varchar2(10),             -- 성별
    createTime  varchar2(50),             -- 계정 생성일
    photo       varchar2(200)             -- 계정 사진
);

-- 테이블 삭제
drop table helperAccount purge;

-- 1개 조회
select *
from helperAccount
where id = ?;

-- 여러개 조회
select *
from (select ROWNUM as rn, tt.* from (select * from helperAccount order by createTime asc) tt)
where rn >= ?
  and rn <= ?;

-- 전체 회원수 조회
select count(*) as cnt
from helperAccount;

-- 회원 추가
insert into helperAccount
values (?, ?, ?, ?, ?, ?, ?, sysdate, ?);

-- 회원 삭제
delete helperAccount
where id = ?;

-- 회원 정보 수정
update helperAccount
set pwd         = ?,
    name        = ?,
    accountType = ?,
    addr        = ?,
    tel         = ?,
    gender      = ?,
    photo       = ?
where id = ?;

