#	Summary/Notes of Research Papers on Program Analysis (Software Analysis)



##	RacerX

See [RacerX](http://web.stanford.edu/~engler/racerx-sosp03.pdf)

- static analysis
- flow-sensitive, interprocedural analysis
- detect race conditions and deadlocks
- analyze multi-threaded programs
- sorts errors by their severity
- counters the impact of analysis mistakes
- perform (or carry out) program checking



##	RaceFuzzer

See [RaceFuzzer](http://www1.cs.columbia.edu/~junfeng/09fa-e6998/papers/racefuzz.pdf)

- Dynamic program analysis of multi-threaded programs
- Distinguish between real races from false races.
- Use potential data race information from existing software/program analysis tools
- Carry out dynamic program analysis to control random scheduler of threads
- Goal #1 of random scheduler of threads: Create real race conditions with high probability.
- Goal #2 of random scheduler of threads: Resolve races (race conditions) randomly at runtime.
- Advantages over existing dynamic analysis tools:
	+ "Create a real race condition and resolve [it] randomly" to determine if it would cause/trigger errors.
	+ Enable a given race condition to be replicated/reproduced, using the same seed for pseudo-random number generation. This avoids the need for recording the execution.
	+ "Has very low overhead" with respect to existing dynamic analysis techniques that can deteect race conditions precisely. It records/tracks only synchronization operations and a pair of memory access statements for each potential race condition.



##	FastTrack

See [FastTrack](http://slang.soe.ucsc.edu/cormac/papers/pldi09.pdf)



##	DataCollider

See [DataCollider](http://research.microsoft.com/pubs/139266/DataCollider%20-%20OSDI2010.pdf)

##	Pointer Analysis using BBD

See [Pointer Analysis using BBD](http://suif.stanford.edu/~jwhaley/papers/pldi04.pdf)

##	Program Analysis via Graph Reachability

See [Program Analysis via Graph Reachability](http://research.cs.wisc.edu/wpis/papers/tr1386.pdf)

##	Efficient Path Profiling

See [Efficient Path Profiling](http://research.microsoft.com/en-us/um/people/tball/papers/pathprof.pdf)

##	Memory Leak Detection

See [Memory Leak Detection](http://www.ics.uci.edu/~guoqingx/papers/xu-icse08.pdf)

##	DART

See [DART](http://dl.acm.org/citation.cfm?id=1065036)

##	CHESS

See [CHESS](http://research.microsoft.com/en-us/projects/chess/pldi07-IterativeContextBounding.pdf)

##	Delta Debugging

See [Delta Debugging](https://www.st.cs.uni-saarland.de/publications/files/zeller-esec-1999.pdf)

##	Statistical Debugging

See [Statistical Debugging](http://www.cs.columbia.edu/~junfeng/09fa-e6998/papers/bug-isolation.pdf)











#	Author Information

The MIT License (MIT)

Copyright (c) <2016> Zhiyang Ong

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.

