CREATE TABLE Sport (
                       id SERIAL PRIMARY KEY,
                       sport_name VARCHAR (50)
);


CREATE TABLE Team (
                      id SERIAL PRIMARY KEY,
                      team_name VARCHAR (50)
);

CREATE TABLE Match (
                       id SERIAL PRIMARY KEY,
                       match_name VARCHAR(50),
                       team_a_id INT REFERENCES Team(id),
                       team_b_id INT REFERENCES Team(id),
                       winner_id VARCHAR(50),
                       sport_id INT REFERENCES Sport(id)
);


CREATE TABLE Player (
                        id SERIAL PRIMARY KEY,
                        player_name VARCHAR (50),
                        team_id INT REFERENCES Team(id)
);

CREATE TABLE Set (
                     id SERIAL PRIMARY KEY,
                     match_id INT REFERENCES Match(id),
                     team_a_score INT,
                     team_b_score INT,
                     set_order INT,
                     winner_id INT REFERENCES Team(id)
);

CREATE TABLE Game (
                      id SERIAL PRIMARY KEY,
                      set_id INT REFERENCES Set(id),
                      team_a_score INT,
                      team_b_score INT,
                      winner_id INT REFERENCES Team(id)
);