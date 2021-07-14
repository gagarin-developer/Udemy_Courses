USE spring;

CREATE TABLE users (
  username varchar(15),
  password varchar(100),
  enabled tinyint(1),
  PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
  username varchar(15),
  authority varchar(25),
  FOREIGN KEY (username) references users(username)
) ;

INSERT INTO spring.users (username, password, enabled)
VALUES
	('zaur', '{noop}zaur', 1),
	('elena', '{noop}elena', 1),
	('alex', '{noop}alex', 1);
    
INSERT INTO spring.authorities (username, authority)
VALUES
	('zaur', 'ROLE_EMPLOYEE'),
	('elena', 'ROLE_HR'),
    ('alex', 'ROLE_HR'),
	('alex', 'ROLE_MANAGER');
    
    