# PlanGenerator

PlanGenerator is a tool designed to generate task plans that serve as alternative options for agents involved in coalition formation problems with dynamic externalities. This tool is particularly relevant in multi-agent systems research and urban mobility optimization.

## Context

This project is based on the research presented in the paper:

> **Coalition Formation with Dynamically Changing Externalities**  
> Y. Sklab, S. Aknine, O. Shehory, A. Tari (2020). *Engineering Applications of Artificial Intelligence*, 91, 103577. DOI: [10.1016/j.engappai.2020.103577](https://doi.org/10.1016/j.engappai.2020.103577)

In this work, the authors introduce the CFDEP (Coalition Formation with Dynamic Externalities Problem) and propose two innovative algorithms:

- **CFDEA (Coalition Formation with Dynamic Externalities Algorithm)**: An algorithm for distributed settings.
- **PSD (Selective Exploration Algorithm)**: An algorithm for centralized settings.

These algorithms have been tested in urban mobility scenarios, demonstrating significant reductions in costs and travel times, as well as improved energy efficiency.

## Features

- **Generation of Task Plans**: Create detailed plans offering alternative tasks for agents involved in coalition formation problems.
- **Consideration of Dynamic Externalities**: Incorporates the impact of coalitions formed at time *t* on future coalitions, essential for collaborative systems such as ride-sharing platforms and shared transport systems.
- **Urban Mobility Optimization**: Facilitates trip coordination to reduce urban congestion and CO₂ emissions.

## Installation
1. Clone the repository:

   ```bash
   git clone https://github.com/YoucefSklab/PlanGenerator.git
