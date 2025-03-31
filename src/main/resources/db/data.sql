insert into user_tb(username, password, fullname, created_at) values ('ssar', '1234', '쌀', now());
insert into user_tb(username, password, fullname, created_at) values ('cos', '1234', '코스', now());


insert into board_tb(title, content, username, created_at)
values ('제목1', '내용1', 'ssar', now());
insert into board_tb(title, content, username, created_at)
values ('제목2', '내용2', 'ssar', now());
insert into board_tb(title, content, username, created_at)
values ('제목3', '내용3', 'ssar', now());
insert into board_tb(title, content, username, created_at)
values ('제목4', '내용4', 'cos', now());
insert into board_tb(title, content, username, created_at)
values ('제목5', '내용5', 'cos', now());