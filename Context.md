Company: Holy Ship! Cruising Company

*This is a speech-to-text excerpt based on an interview with the CEO of the company*

The Holy Ship! Cruising Company (HSCC) offers worldwide water voyages to 1000s of customers every year. 

The HSCC has a fleet of different ship types (eg: Number of passengers, entertainment facilities on board, fuel consumption rate, etc...).

A cruise ship has a crew with a number of different positions (eg Captain, Sailor, Cook, Cleaner, ...). Not all crewmen work during the whole voyage (except for the captain).
We need to keep a historic record of which personnel was present during which voyage.

A voyage is a trip of a certain timespan (usually 1 - 2 weeks) where the start and end port are the same. During the voyage, the ship might have several stops where additional passengers might (dis)embark.
Eg Venice -> Antwerp -> Rotterdam -> Hamburg -> Rotterdam -> Antwerp -> Venice 

A ship also needs to keep a record of all passengers present at any point in time.

A ship has a number of different room types for passengers (that determines the cost of the ticket). EG: Suite, lower deck room or upper deck room.

When a new voyage is posted on the HSCC website, clients can buy a ticket that grants access to a room. A room has a number of beds, so eg 1 ticket might result in 4 passengers boarding (each passenger gets 1 boarding pass).
When they buy a ticket, they need to provide their name, e-mail, telephone number. If they want to receive a physical boarding pass, they also need to provide their address.
This boarding pass is used to check in during boarding and will also be scanned when the passenger leave the ship so the HSCC knows who has left.
Usually, ticket are sold gradually over several weeks, there is no Tomorrowland-like rush when posting a new voyage on the site.

Two weeks before the voyage starts, we check if enough tickets have been sold to make the voyage financially viable (at least 50% of the rooms need to be booked). 
If the voyage is financially viable, the credit cards of the clients are credited, otherwise the voyage is cancelled.
At this point, we also need to schedule the personnel needed.

Each ship has a certain fuel storage and fuel consumption rate. This needs to be taken into account when planning a voyage. Stops need to be planned where the ship can be refueled.

*AS IS and TO BE*

Already 'developed': A voyage can be created using a wizard in the UI. First the tour is given a name, second the stops are added. Finally the vessel is chosen and its characteristics are coupled to the voyage.
Once this wizard has been completed, you can publish the voyage. A published voyage can be cancelled.

A customer can also buy a ticket for a cabin having a certain type and capacity.

_Your mission:_

Take a look at the existing code. It has a number of (according to the CEO) 'small' flaws. 
Redesign/Refactor with the DDD mindset and keep the rest of the given context in mind.

One of the HSCC customers (Mr De Bie and Mr Jani) will be in your group to answer all your (functional) questions.

Potential deliverables:
- Schema with Aggregate - Entities - Value Objects (eg in Mural or Draw.io)
- Refactor the code: 
  - What should an Aggregate/Value object look like? 
  - What properties should it (not) have?
  - Other topics like factories, services or repositories (etc) should also be considered
- Can your design also handle the other requirements mentioned in the context? What problems would occur with the current setup?
- 
