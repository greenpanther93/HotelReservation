insert into agency(name,description)
values('BasicAgency','This is a basic agency.');
insert into agency(name,description)
values('DeluxeAgency','This is a deluxe agency.');

insert into hotel(agency_id,name,stars,description)
values(1,'BasicHotel',4,'This is a basic hotel');
insert into hotel(agency_id,name,stars,description)
values(1,'Ibis',2,'Bienvenue à Ibis Red');
insert into hotel(agency_id,name,stars,description)
values(2,'Hôtel Richer de Belleval',5,'Luxury Hotel');