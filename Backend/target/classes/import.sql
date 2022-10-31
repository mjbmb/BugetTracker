ALTER TABLE customer ALTER name SET DEFAULT 'name';
ALTER TABLE customer ALTER organisation SET DEFAULT 'not mentioned';
ALTER TABLE customer ALTER email SET DEFAULT 'not mentioned';
INSERT INTO customer (name, organisation, email) VALUES ('Mustermann', 'MasterMind', 'max@mustermann.at'),('Mustermann', 'MasterMind', 'max@mustermann.at'),('Mustermann', 'MasterMind', 'max@mustermann.at'),('Mustermann', 'MasterMind', 'max@mustermann.at'),('Mustermann', 'MasterMind', 'max@mustermann.at'),('Mustermann', 'MasterMind', 'max@mustermann.at');
