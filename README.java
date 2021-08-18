- 👋 [8/18, 6:21 AM] Ebrahim: Initially all m ∈ M and w ∈W are free
While there is a man m who is free and hasn’t proposed to every woman
Choose such a man m
Let w be the highest-ranked woman in m’s preference list to whom m has not yet proposed
If w is free then
(m, w) become engaged
Else w is currently engaged to m’
If w prefers m to m’ then
(m, w) become engaged
m’ becomes free
Else
m remains free
Endif
Endif
Endwhile
Return the set S of engag
[8/18, 6:46 AM] Ebrahim: 1. for w = 0, W
 2. do V [0,w] ← 0
 3. for i=0, n
 4. do V [i, 0] ← 0  
 5. for w = 0, W
 6. do if (wi≤ w & vi + V [i-1, w -  wi]> V [i -1,W])
 7. then V [i, W] ← vi + V [i - 1, w - wi]
 8. else V [i, W] ← V [i - 1, w]
[8/18, 6:46 AM] Ebrahim: Purpose:Tofindthemaximumvalueorprofitfromthegivennitemsandtheirweightswi//Input:Asetofitems1,2,…….n,with,w1,…,wN,andvaluesv1,v2……,vnwithknapsackcapacityW//Output:MaxProfitM[n,W
[8/18, 7:13 AM] Ebrahim: Input, grapgh with edges and vertices
Output, set of edges of minimum spanning tree

Algorithm kruksal
Sort the edges in order of increasing cost
Initially T=خالي
For each edge e=(v,w) in the sorted order
If there is currently no path from v to w in (v,T) then (adding e will not create a cycle )
Add e to T 
End if
End for
Return set of edges
[8/18, 7:21 AM] Ebrahim: Dijkar's algorithm
Let s be the set of exposed nodes
For each uتنمتي S we store a distance (u)
Initially s={s} and d(s) =0
While sلاتساوي V
Select a node vليست جزء  with at least one edge from S for which dشرطة(v)=min d(u)+ le is as smart as possible 
e=(u,v):uتنتميS
Add V to S and define d(v)=dشرطةv
Endwhile
[8/18, 7:28 AM] Ebrahim: The problem can be solved using quicksort algorithm where the rearrangement of element is accomplished by picking some element ofa[ ]
Say t=a[s] and then reorderingthe other elements so that sorted sub arrays need not be merged later and the elements appearing before t in a[1:n] are less than or equal to t and all elements appearing after the are greater than or equal to t
This is called partitioning
[8/18, 9:24 AM] Ebrahim: Suitable algorithm is BFS
Algorithm BFS
Mark s as 'visited'
Initialize R={S}
While Li is not empty
For each node u inLi
Consider each edge(u,v) incident to V
If V is not marked 'visited'
then Mark V as visited 
Add V to set R and to layerLi+1
End if
End for
Endwhile
[8/18, 9:27 AM] Ebrahim: Initialize S to be stock of one element S
While S is not empty
Take a node u from S
If Explored[u] = False then
For each edge (u,v) incident to u
Add v to stock S
End for
Endif
Endwhile
