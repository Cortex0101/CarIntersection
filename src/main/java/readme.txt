a) What is the idea of the application?

The application simulates a road with only a single lane serving cars from east and west. Only one
car can use the single lane at a time from any direction; this is to avoid deadlock. Semaphores are
used to prevent accidents.

b) Why is concurrency needed?

In our application, concurrency allows many cars to operate independently of each other. However,
the application also demonstrates how these independently executing threads (the cars) can share a
single resource (the single lane).

c) What could be the potential issues specifical?
	d) Address race conditions
  Race conditions occur when multiple threads access and change shared resources simultaneously.
  Thread scheduling algorithms can swap threads at any time. Thus the order in which the threads
  access the shared data is unknown. The result of changing the shared data is then dependent on
  the thread scheduling algorithm, hence the name "race condition: both threads are "racing" to
  access/modify the shared data.

  In this application, the shared data is the bridge. If two cars were to use the single lane at
  the same time, it would result in an accident.

	e) Solution for race conditions
  Mutual exclusion states that "no two processes can exist in the critical section at any given time".

  In this application, a semaphore is used to control access to the single lane. No other cars are
  allowed to enter the lane when a car enters the lane from either direction.

	f) Address deadlocks and starvation
  A deadlock occurs when two or more processes hold some resources and wait for resources held by other(s).
  Starvation occurs when a high-priority process continues to execute, blocking low-priority processes indefinitely.

	g) Solution for deadlocks and starvation
  This application does not produce any deadlocks, as the only resource the cars need is the road.
  It also cannot produce starvation, as the cars all have the same priority.
  There are various ways to avoid deadlocks and starvation. Deadlocks can, for example, be handled
  by using "deadlock detection and recovery". The deadlock is allowed to occur, but then preemption
  to handle it once it's happened.


Example output of running the application with 4 cars from each side:
(West) Car 22 is waiting
(West) Car 19 is waiting
(East) Car  23 is waiting
(West) Car 22 has the green light
(West) Car 26 is waiting
(East) Car  25 is waiting
(West) Car 24 is waiting
(East) Car  20 is waiting
(East) Car  21 is waiting
(West) Car 22 is passing the lane
(West) Car 22 has passed the lane
(East) Car  21 has the green light
(East) Car  21 is passing the lane
(East) Car  21 has passed the lane
(West) Car 24 has the green light
(West) Car 24 is passing the lane
(West) Car 24 has passed the lane
(East) Car  23 has the green light
(East) Car  23 is passing the lane
(East) Car  23 has passed the lane
(West) Car 19 has the green light
(West) Car 19 is passing the lane
(West) Car 19 has passed the lane
(West) Car 26 has the green light
(West) Car 26 is passing the lane
(West) Car 26 has passed the lane
(East) Car  20 has the green light
(East) Car  20 is passing the lane
(East) Car  20 has passed the lane
(East) Car  25 has the green light
(East) Car  25 is passing the lane
(East) Car  25 has passed the lane