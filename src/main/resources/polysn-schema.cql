// IF EXISTS added for Cassandra 2.1
// CQL 3.1.0
DROP KEYSPACE IF EXISTS polysn;
CREATE KEYSPACE polysn WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3 };

use polysn;

// User credentials, keyed by email address so we can authenticate
// Seperated from user in case auth is external (Google, Facebook, etc...)
CREATE TABLE user_credentials (
   email text,
   password text,
   user_id uuid,
   PRIMARY KEY (email)
);

// Basic entity table for a user
// UUID for userid to link to auth system
CREATE TABLE user (
   user_id uuid,
   last_name varchar,
   first_name varchar,
   email text,
   created_date timestamp,
   PRIMARY KEY (user_id)
);