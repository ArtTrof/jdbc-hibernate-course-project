insert into "user"(user_name, password, user_role_id, profile_id)
VALUES ('Admin', 'Admin', 1, 1),
       ('SuperAdmin', 'SuperAdmin', 2, 2),
       ('User', 'User', 3, 3),
       ('Artem', 'Artem', 2, 4),
       ('Olga', 'Olga', 3, 5);

insert into incident(service_name, is_active, problem_description, user_id)
VALUES ('Some service', true, 'Something went wrong', 1),
       ('Validator', false, 'Validation failed', 2),
       ('Tester', true, 'Testing went wrong', 2),
       ('Tax', false, 'Wrong billing type', 3),
       ('HR', true, 'Salary overpay', 5);

insert into user_role(role_name, role_description)
VALUES ('ADMIN', 'ADMIN ROLE'),
       ('SUPER_ADMIN', 'SUPER ADMIN ROLE'),
       ('USER', 'Default user role');

insert into profile(first_name, last_name, email, phone_number, postal_code)
VALUES ('Viktor', 'Dudka', 'viktordudka@gmail.com', '+380999999999', '50-115'),
       ('Andrew', 'Tate', 'cobra@gmail.com', '+380999999998', '50-112'),
       ('Conor', 'McGregor', 'gregor@gmail.com', '+380999999993', '50-001'),
       ('Artem', 'Trofymenko', 'theBest@gmail.com', '+380999999939', '50-114'),
       ('Olga', 'Korgi', 'olala@gmail.com', '+380999999319', '40-115');
insert into service(service_name, is_active, service_month_price, customer_id)
VALUES ('Some service', true, 2000, 2),
       ('Validator', true, 200, 1),
       ('Tester', true, 10000, 5),
       ('Tax', true, 25000, 3),
       ('HR', false, 20, 4);

alter table "user"
    add constraint fk_profile_id foreign key (profile_id) references profile (id) on delete cascade;
alter table incident
    add constraint fk_user_id foreign key (user_id) references "user" (id) on delete cascade;
alter table "user"
    add constraint fk_user_role_id foreign key (user_role_id) references user_role (id) on delete set null;
alter table user_services
    add constraint fk_user_service_id foreign key (user_id) references "user" (id) on delete no action;
alter table user_services
    add constraint fk_service_id foreign key (service_id) references service (id) on delete no action;
