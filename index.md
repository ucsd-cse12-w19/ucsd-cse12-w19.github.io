---
layout: page
title: CSE 12 Winter 2019, A &amp; B Sections
doodle: "/doodle.png"
---

# Basic Data Structures and Object-Oriented Design

[This site is under construction, and its contents are not the official policy of CSE12 until Monday, January 7]

<a href="https://jpolitz.github.io">Joe Gibbs Politz</a> (Instructor)

This course focuses on two main topics: The basics of organizing data for
efficient computation, and the design of programs that use collections,
classes, and interfaces.

Each week, we will explore topics in these areas interactively during lectures.
You will read beyond what we explore in lecture, complete programming
assignments to hone your coding and program design skills, and take exams that
test your understanding of what you've learned. After, you'll be better at
designing and understanding programs and the structure of data they work
over.

Basics: <a href="#b:lec">Lecture</a>, <a href="#b:disc">Discussion</a>,
<a href="#pa">Programming Assignments</a>, and <a
href="#b:exams">Exams</a>. Check the <a href="#schedule">Schedule</a> for
class topics, links to resources, and assignment due dates. The <a
href="#staff">course instructional team</a> is here to help you learn: <a
href="#pa:help">ask for help and advice</a>!

## Schedule
<a id="schedule"></a>

## Basic Course Components
<a id="basics"></a>

### <a id="b:lec" href="#b:lec">Lecture</a>

Expect class to be interactive; you'll work through problems in groups, compare multiple approaches to solutions, and answer multiple-choice questions using iClickers (see <a href="#p:engage">Engagement</a> below). Due to space constraints, you must attend the lecture in which you're enrolled.

<table class="table table-striped">
<thead>
  <tr>
    <th>Lecture</th><th>Time</th><th>Location</th>
  </tr>
</thead>
<tr>
  <td> A00 </td><td>MWF 8am</td><td>WLH2005 </td>
</tr>
<tr>
  <td>B00 </td><td>MWF 3pm </td><td>York 2622</td>
</tr>
</table>

### <a id="b:disc" href="#b:disc">Discussion</a>

Discussions will reinforce concepts from class and introduce concepts that
are especially helpful for completing programming assignments. Students from
either section can attend either discussion.

<table class="table table-striped">
<thead>
  <tr>
  <th>Time</th><th>Location</th>
  </tr>
</thead>
<tr>
  <td>T 8pm </td><td>PCYNH 109</td>
</tr>
<tr>
  <td>F 5pm </td><td>York 2622</td>
</tr>
</table>

### <a id="b:materials" href="#b:materials">Materials</a>


There is no required textbook for the course. 

I have made a ZyBook available that I've used in the past ([LINK COMING SOON
UCSDCSE12PolitzWinter2019]). You can purchase a subscription and use it at
your convenience; it serves as a useful reference and is organized in the
order material is presented in this course.

We may use other on-line resources during the quarter that may be required
reading or activities. These will all be free and linked from the schedule.

Online discussion and Q&A for the class will be available on Piazza: sign up to
<a href="http://piazza.com/ucsd/winter2019/cse12" target="_blank">join the class here</a>
and <a href="http://piazza.com/ucsd/winter2019/cse12/home" target="_blank">view the discussion forum here</a>.
Important announcements from the course team will be pinned at the top of your feed.
When you set up your account, you can select the frequency for email notifications of messages and discussions
on Piazza.  Piazza is one way you can <a href="#pa:piazzahelp">ask for and get help</a> in this course.

<a href="https://docs.oracle.com/javase/11/" target="_blank">The
documentation for the Java language</a>, while not required reading, will be
linked to from some assignments and is always a useful reference while
programming. We will be using Java version **11** for the programming
assignments in this course, which is available at <a href="https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html">Oracle's web site</a>.

You'll be submitting your classwork and seeing grading feedback through a
tool called <a href="http://gradescope.com/" target="_blank">Gradescope</a>.

You'll be receiving starter code through a service called <a
href="https://github.com" target="_blank">Github</a>. You aren't required to
have an account to complete coursework, but it can be useful for you to make
one.

## <a id="programming" href="#programming">Programming</a>

Most weeks, you will be working on a programming assignment for this class.
There are several specific policies in place regarding programming
assignments, and you should pay careful attention to them.

### <a id="p:open-closed" href="#p:open-closed">Collaboration</a>

**This is not the same collaboration policy you have seen in your other
programming courses. Read it carefully.**

There are two types of assignments in this course:

- **Open collaboration** assignments, for which you can talk to anyone else
  in the course, post snippets of code on Piazza, get lots of help from TAs,
  and generally come up with solutions collaboratively. TAs will be happy to
  look at your code and suggest fixes, along with explaining them.
  
  There are a few restrictions:
  - Any code that you didn't write must be cited in the README file that goes
    along with your submission
      - **Example:** On an open collaboration assignment, you and another
        student chat online about the solution, you figure out a particular
        helper method together. Your README should say “The FOO function was
        developed in collaboration with Firstname Lastname”
      - **Example:** On an open collaboration assignment, a student posts the
        recursive method calls they used to solve a problem you were
        struggling with. Your README should say “I used the code from
        https://piazza.com/class/id-of-post”
  - Anyone you work with in-person must be noted in your README
      - **Example:** You and another student sit next to each other in the lab,
        and point out mistakes and errors to one another as you work through
        the assignment. As a result, your solutions are substantially similar.
        Your README should say “I collaborated with Firstname Lastname to
        develop my solution.”
  - You cannot share an entire repository of code or paste an entire solution
    into Piazza. Keep snippets to reasonable, descriptive chunks of code; think
    a dozen lines or so to get the point across.
  - You still _cannot_ use code that you find online, or get assistance or code
    from students outside of this offering of the class. All the code that is
    handed in should be developed by you or someone in the class.

  This doesn't mean the staff will be handing out answers. We'll mostly
  respond with leading questions and advice, and you shouldn't expect a
  direct answer to questions like “am I done?” or “is my code right?”

  There is no guarantee the assistance you get from your classmates is
  correct. It is your responsibility to use your judgment to avoid using an
  idea on Piazza that is wrong, or doesn't work with your solution; we won't
  necessarily tell you one way or another while the assignment is out.

- **Closed collaboration** assignments, where you cannot collaborate with others.
  You can ask clarification questions and report potential issues as private
  posts on Piazza or of staff members. However, staff will not look at your
  code or comment on it. Lab/office hours these weeks are for conceptual
  questions or for questions about past assignments only, no code assistance.
  Treat these assignments like take-home exams.

  On these assignments:
    - You cannot look at or use anyone else's code in any way.
    - You cannot discuss the assignment with anyone other than the course
      staff.
    - You should expect that staff members will politely say “I won't help
      with that” if you ask a question about your algorithm or code for a
      closed collaboration assignment.
    - You cannot post publicly about the assignment on Piazza or elsewhere
      online
    - All of the examples in the open collaboration section above would be
      academic integrity violations on a closed collaboration assignment.

_Rationale_ – In your professional programming life, some of your work will
be highly collaborative with lots of expert advice available from senior
developers and from sites like StackOverflow. This is a common case in
companies, in academia, and on open-source projects. In contrast, some of
your work will involve figuring out programming problems on your own, where
you are the first person to encounter an issue, or the first person to try
using a new library in the context of your application. You should get
experience in both types of situations; the former is similar to open
collaboration, and the latter is similar to closed collaboration.

In terms of courses, this split also makes sense. Programming assignments
serve (at least) two roles. First and foremost, they are a mechanism for you
to learn! By directly applying the techniques and skills we discuss in class,
you get practice and become a better programmer. Second, they are an
assessment mechanism – as instructional staff we use them to evaluate your
understanding of concepts as demonstrated by your programs. Open
collaboration can reduce frustration while learning and give you chances to
enjoy collaboration and lots of help, but may not let us accurately evaluate
your understanding. Closed collaboration assignments are an opportunity for
you to demonstrate what you know by way of programming.

Programming assignments will explicitly list whether they are open or closed
collaboration.

You should be familiar with [the UCSD
guidelines](http://senate.ucsd.edu/Operating-Procedures/Senate-Manual/Appendices/2)
on academic integrity as well.

### <a id="p:grading" href="#p:grading">Grading Programming Work</a>

Each programming assignment will have a portion that is automatically graded,
and a portion that is manually graded by the course staff.

After each assignment's deadline, we will open a resubmission for that
assignment for two weeks (this time period may be shorter for assignments
near the end of the quarter). You can resubmit to improve the automated part
of your grade. You can gain up to _half_ the points you lost in the initial
submission through resubmission; we'll divide the difference of the initial
and resubmission by 2 and add it to the original. There's no penalty for
(accidentally or intentionally) resubmitting work that is marked lower. There
is no way to resubmit and recover points for the manually graded part of
assignments.

This policy also serves as the late policy for programming assignments; if
you don't submit an assignment, the initial grade is 0, and you can get half
of the automated points by submitting after the deadline. There is no other
late policy for programming work.

_Example_: On a PA, you submit and get 40/80 for the automated score, and
10/20 for the manual score. After the deadline, you find many of your
mistakes and resubmit, and get a new automated grade of 70/80. Your new score
would be

(70 - 40) / 2 + 40 = 55

for the automated part, and the manually-graded part would remain 10, for
total of 65 (rather than the original 50) points on the assignment.

In addition, closed-collaboration assignments are treated as **open** once
their deadline passes. You can talk to other students about them, get coding
help from staff on them, and so on.

