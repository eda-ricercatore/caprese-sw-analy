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

- Address race conditions in multi-threaded programs.
- Improvements can be found in:
	+ Better/Same performance in dynamic analysis and
		better precision in detecting race conditions,
		and reduce amount of false alarms.
		* Report false alarms for imprecise results.
	+ Better/Same precision in detecting race conditions
		and better performance in dynamic analysis
		* Produces precise results that means no false alarms
			are reported.




##	DataCollider

See [DataCollider](http://research.microsoft.com/pubs/139266/DataCollider%20-%20OSDI2010.pdf)

- A dynamic analysis technique that is "lightweight and effective"
- Addresses a subset of concurrency errors; specifically, data races
	that occur when multiple "threads erroneously access a shared
	memory location without appropriate synchronization".
- During dynamic analysis, it detects data races in kernel modules.
- It is oblivious to synchronization protocols, including those based
	on locking, used in limiting/protecting shared memory accesses.
	+ This is helpful for analyzing low-level code, which tends to
		use a variety of synchronization protocols/mechanisms that
		are specific for a device or computer architecture.
- It carries out random sampling on memory accesses to reduce
	runtime overhead.
	+ This prunes the amount of candidates that need to be evaluated
		for data race errors.
- In addition, to keep runtime overheads as insignificant/negligible,
	it exploits breakpoint facilities in hardware architectures.



##	Pointer Analysis using BDD

See [Pointer Analysis using BDD](http://suif.stanford.edu/~jwhaley/papers/pldi04.pdf)

This is erroneously titled, "Pointer Analysis using BBD," by Prof. Jeff Huang.

- "Scalable context-sensitive, inclusion-based pointer alias analysis for *Java* programs"
- It provides context sensitivity by cloning a method for context of interest, and running a context-insensitive algorithm over the expanded call graph that contains the cloned method.
	+ To obtain (more) precise results, it clones each acyclic path in the call graph of the program under analysis.
		A single node in the call graph can represent all methods in a strongly connected component.
	+ BDDs can be used to efficiently represent each of these acyclic paths, which can amount to 10^14.
- Scalability can be obtained via usage of "a context numbering scheme that [reveals/]exposes commonalities across contexts"
- A declarative, logic programming language *Datalog* is used to implement the aforementioned pointer alias analysis; the authors have also developed software to translate the *Datalog* programs into "efficient BDD implementations."
- A variety of context-sensitive pointer alias analysis techniques have been developed/implemented, such as: side effect analysis, type analysis, and escape analysis.




##	Program Analysis via Graph Reachability

See [Program Analysis via Graph Reachability](http://research.cs.wisc.edu/wpis/papers/tr1386.pdf)

- Discusses the transformation of certain problems in program analysis into problems in graph reachability. 
- Problems in program analysis that can be transformed as aforementioned include:
	+ program slicing
	+ certain dataflow analysis problems
	+ approximation of possible "shapes" of a program's heap-allocated structures
	+ flow-insensitive points-to analysis



##	Efficient Path Profiling

See [Efficient Path Profiling](http://research.microsoft.com/en-us/um/people/tball/papers/pathprof.pdf)

- A definition of path profile is provided: it 



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


Sampling infrastructures, with low overhead








#	Author Information

The MIT License (MIT)

Copyright (c) <2016> Zhiyang Ong

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Email address: echo "cukj -wb- 23wU4X5M589 TROJANS cqkH wiuz2y 0f Mw Stanford" | awk '{ sub("23wU4X5M589","F.d_c_b. ") sub("Stanford","d0mA1n"); print $5, $2, $8; for (i=1; i<=1; i++) print "6\b"; print $9, $7, $6 }' | sed y/kqcbuHwM62z/gnotrzadqmC/ | tr 'q' ' ' | tr -d [:cntrl:] | tr -d 'ir' | tr y "\n"		Don't compromise my computing accounts. You have been warned.

