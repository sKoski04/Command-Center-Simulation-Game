# Command Center – Backend Simulation Game

## Overview
Command Center is a backend-driven military command simulation.
The player progresses from company-level command to higher strategic levels.

The project focuses on:
- backend architecture
- relational database design
- service-layer driven game logic

## Tech Stack
- Java (pure JDBC)
- PostgreSQL
- SQL
- Maven / Gradle (if used)
- CLI (initially)

## Architecture
The project is structured into clear layers:

- Database (PostgreSQL)
- DAO / CRUD layer (JDBC)
- Service layer (game logic)
- Game engine
- CLI (future)

## Database Design
The database models a hierarchical military structure:
Soldier → Squad → Platoon → Company → Battalion → Brigade

All relationships are explicitly handled via foreign keys.

## Game Concept
The game simulates decision-making at different command levels.
Early gameplay focuses on logistics and readiness.
Later gameplay introduces combat and strategic choices.

## Project Status
- CRUD layer completed
- Service layer in progress
- Game engine planned
- REST API planned (future)
