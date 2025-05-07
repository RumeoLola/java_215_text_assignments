+-----------------------------+
|         Time               |
+-----------------------------+
| - hour: int                |
| - minute: int              |
| - meridian: String         |
+-----------------------------+
| + Time(hour: int, minute: int, meridian: String)          |
| + Time(timeStr: String) throws InvalidTime               |
| + compareTo(other: Time): int                            |
| + toString(): String                                     |
| + getHour(): int                                         |
| + getMinute(): int                                       |
| + getMeridian(): String                                  |
+-----------------------------+
<<implements Comparable<Time>>


+--------------------------------------------------+
|        Interval<T extends Comparable<T>>         |
+--------------------------------------------------+
| - start: T                                       |
| - end: T                                         |
+--------------------------------------------------+
| + Interval(start: T, end: T)                     |
| + within(value: T): boolean                      |
| + crossOver(other: Interval<T>): boolean       |
| + overlaps(other: Interval<T>): boolean          |
| + getStart(): T                                  |
| + getEnd(): T                                    |
| + toString(): String                             |
+--------------------------------------------------+


+----------------------+
|     InvalidTime      |
+----------------------+
| + InvalidTime(msg: String)       |
| + getMessage(): String (inherited) |
+----------------------+
<<extends Exception>>


+-------------------------------+
|  ComparableController         |
+-------------------------------+
| - startInterval1Field: TextField    |
| - endInterval1Field: TextField      |
| - startInterval2Field: TextField    |
| - endInterval2Field: TextField      |
| - timeToCheckField: TextField       |
| - resultField: TextField            |
| - compareIntervals: Button          |
| - checkTime: Button                 |
+-------------------------------+
| + handleCompare(event: ActionEvent): void |
| + handleTime2(event: ActionEvent): void   |
+-------------------------------+
<<JavaFX Controller>>

