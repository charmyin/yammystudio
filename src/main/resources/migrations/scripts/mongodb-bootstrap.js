/*

drop table if exists basic_menu CASCADE;
drop table if exists shiro_user_role CASCADE;
drop table if exists shiro_role CASCADE;
drop table if exists shiro_user CASCADE;
drop table if exists basic_organization CASCADE;


create table basic_organization (id int not null AUTO_INCREMENT, name varchar(40), parent_id int, organizationType int, order_number int default 999999, remark varchar(200), primary key(id), foreign key (parent_id) references basic_organization (id));

INSERT INTO BASIC_ORGANIZATION ( NAME, REMARK ) values ( '组织架构','组织架构备注' ) ;

CREATE TABLE shiro_user (id int NOT NULL AUTO_INCREMENT, login_id VARCHAR(50) NOT NULL UNIQUE, name varchar(50), organization_id int, email VARCHAR(100) NOT NULL UNIQUE, sex int, cellphone varchar(100), passphrase VARCHAR(100) NOT NULL, salt VARCHAR(100) NOT NULL, state boolean default true, date_created TIMESTAMP NOT NULL, remark varchar(200), PRIMARY KEY (id), foreign key (organization_id) references basic_organization(id));

insert into shiro_user (login_id, name, email, sex, cellphone, passphrase, salt, state, organization_id, date_created) values ('admin','admin', 'adminadmin@gmail.com', 0, '13088811818', 'wHcjhQc5KwW7zSO5OfQ6FRqvpcE2Zw6FkVHJRcnE57AoeaPaZ5DboqYbHGBjOKDE8Rl9+bclnF6lQ4y0D6GiaA==', 'qpOvViSVIY7XyYMpAsJHnQ==', TRUE, 1,'2013-06-25 14:54:22.646');

CREATE TABLE shiro_role (id int NOT NULL AUTO_INCREMENT, name VARCHAR(50) NOT NULL, description VARCHAR(200), organization_id int, permission varchar(300), menu VARCHAR(500), remark varchar(200), state boolean default true, PRIMARY KEY (id), foreign key (organization_id) references basic_organization(id));


insert into shiro_role (name,description, organization_id, permission, menu,  remark, state) values ('developer', '开发者角色', 1,'[{"permission":"menu:getallxx","remark":"eeee"}]',  '1,2,3,4,5,6,7,8,9', '开发者角色', true);

CREATE TABLE shiro_user_role (user_id int NOT NULL, role_id int NOT NULL, PRIMARY KEY (user_id, role_id),FOREIGN KEY (user_id) REFERENCES shiro_user (id), FOREIGN KEY (role_id) REFERENCES shiro_role (id));


insert into shiro_user_role (user_id, role_id) values (1, 1);


create table basic_menu (id int not null AUTO_INCREMENT, name varchar(20), parent_id integer, link_url varchar(300) not null, order_number int default 999999, remark varchar(200), full_permission varchar(300), read_permission varchar(300), primary key(id), FOREIGN KEY (parent_id) REFERENCES basic_menu (id));


insert into basic_menu (name, link_url) values ('root','') ;
insert into basic_menu (name, parent_id, link_url) values ('系统管理',1,''); 
insert into basic_menu (name, parent_id, link_url) values ('开发人员管理',1,''); 
insert into basic_menu (name, parent_id, link_url) values ('模板子系统',1,''); 
insert into basic_menu (name, parent_id, link_url) values ('权限管理',2,''); 
insert into basic_menu (name, parent_id, link_url) values ('菜单资源管理',5,'menu/manage'); 
insert into basic_menu (name, parent_id, link_url) values ('角色管理',5,'role/manage');
insert into basic_menu (name, parent_id, link_url) values ('用户管理',5,'user/manage');
insert into basic_menu (name, parent_id, link_url) values ('组织机构管理',5,'organization/manage');
*/


db.basic_menu.drop();
db.shiro_user_role.drop();
db.shiro_role.drop();
db.shiro_user.drop();
db.basic_organization.drop();

db.basic_organization.insert({"_id":NumberInt(1),"name":"组织架构", "remark":"组织架构备注"});

db.shiro_user.insert({"_id":NumberInt(1),"loginId":"admin", "name":"admin", "email":"admin@admin.com", "sex":"1", "cellphone":"22222222222", "passphrase":"wHcjhQc5KwW7zSO5OfQ6FRqvpcE2Zw6FkVHJRcnE57AoeaPaZ5DboqYbHGBjOKDE8Rl9+bclnF6lQ4y0D6GiaA==", "salt":"qpOvViSVIY7XyYMpAsJHnQ==", "state":true, "organizationId":1, "dateCreated":new Date()});

db.shiro_role.insert({"_id":NumberInt(1),"name":"developer","description":"开发者角色", "organizationId":NumberInt(1), "permission":"", "menu":"1,2,3,4,5,6,7,8,9",  "remark":"开发者角色", "state":true});

db.shiro_role.insert({"_id":NumberInt(1),"userId":NumberInt(1), "roleId":NumberInt(1)});

db.basic_menu.insert({"_id":NumberInt(1),name:"root", linkUrl:""});
db.basic_menu.insert({"_id":NumberInt(2),name:"系统管理", parentId:1, linkUrl:""});
db.basic_menu.insert({"_id":NumberInt(3),name:"开发人员管理", parentId:1, linkUrl:""});
db.basic_menu.insert({"_id":NumberInt(4),name:"模板子系统", parentId:1, linkUrl:""});
db.basic_menu.insert({"_id":NumberInt(5),name:"权限管理", parentId:2, linkUrl:""});
db.basic_menu.insert({"_id":NumberInt(6),name:"菜单资源管理", parentId:5, linkUrl:""});
db.basic_menu.insert({"_id":NumberInt(7),name:"角色管理", parentId:5, linkUrl:""});
db.basic_menu.insert({"_id":NumberInt(8),name:"用户管理", parentId:5, linkUrl:""});
db.basic_menu.insert({"_id":NumberInt(9),name:"组织机构管理", parentId:5, linkUrl:""});





