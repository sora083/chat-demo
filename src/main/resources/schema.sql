CREATE TABLE IF NOT EXISTS chat (
  room_id INT primary key auto_increment,
  commented_datetime DATETIME,
  user_name VARCHAR(20),
  message VARCHAR(100),
);

INSERT INTO chat (room_id, commented_datetime, user_name, message) VALUES (1, null, 'test1', 'message123');