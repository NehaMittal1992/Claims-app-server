CREATE TABLE CLAIM(
clm_id BIGINT(20) NOT NULL AUTO_INCREMENT,
clm_no VARCHAR(15),
clm_type_cd VARCHAR(15),
policy_id BIGINT(20),

PRIMARY KEY (clm_id)

)

insert into CLAIM(clm_id,clm_no,clm_type_cd,policy_id) values(1,'PA1001','glass', 'PA11')