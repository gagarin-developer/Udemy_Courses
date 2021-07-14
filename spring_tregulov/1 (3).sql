CREATE TABLE spring.children (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  age int,
  PRIMARY KEY (id)
);

CREATE TABLE spring.section (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  PRIMARY KEY (id)
);

CREATE TABLE spring.child_section (
  child_id int NOT NULL,
  section_id int NOT NULL,
  PRIMARY KEY (child_id, section_id),
  FOREIGN KEY (child_id) REFERENCES spring.children(id),
  FOREIGN KEY (section_id) REFERENCES spring.section(id));