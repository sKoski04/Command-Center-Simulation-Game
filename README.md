# Command Center – Simulation Game (Relational database training)

## Overview
Command Center is a backend-driven military command simulation.
The player progresses from company-level command to higher strategic levels.

The project focuses on:
- backend architecture
- relational database design


## Tech Stack
- Java (pure JDBC)
- PostgreSQL
- SQL


## Architecture
The project is structured into clear layers:

- Database (PostgreSQL)
- DAO / CRUD layer (JDBC)
- Logic layer


## Database Design
The database models a hierarchical military structure:
Soldier → Squad → Platoon → Company → Battalion → Brigade. 
I chose this theme since the relationships are easy to understand and simple enough to implement for a training project.


All relationships are explicitly handled via foreign keys.

## Game Concept  (Possible future implementation)
The game simulates decision-making at different command levels.
Early gameplay focuses on logistics and readiness.
Later gameplay introduces combat and strategic choices.
(LATE 2026)

## Project Status
- CRUD layer completed
- Logic layer in progress
- Game logic planned
- GUI (future)
