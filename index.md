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

In your professional programming life, some of your work will be highly
collaborative with lots of expert advice available from senior developers and
from sites like StackOverflow. This is a common case in companies, in
academia, and on open-source projects. In contrast, some of your work will
involve figuring out programming problems on your own, where you are the
first person to encounter an issue, or the first person to try using a new
library in the context of your application. You should get experience in both
types of situations; we might call the former kind of problem **open to
collaboration** and the latter **closed to collaboration**.

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

There are two types of assignments in this course:

- **Open collaboration** assignments, for which you can talk to anyone else
  in the course, post snippets of code on Piazza, get lots of help from TAs,
  and generally come up with solutions collaboratively. TAs will be happy to
  look at your code and suggest approaches and fixes.
  
  There are a few restrictions:
  - Any code that you didn't write must be cited in the README file that goes
    along with your submission

    **Example:** On an open collaboration assignment, you and another
    student chat online about the solution, you figure out a particular
    helper method together. Your README should say “The FOO function was
    developed in collaboration with Firstname Lastname”

    **Example:** On an open collaboration assignment, a student posts the
    recursive method calls they used to solve a problem you were
    struggling with. Your README should say “I used the code from
    https://piazza.com/class/id-of-post”

  - Anyone you work with in-person must be noted in your README

    **Example:** You and another student sit next to each other in the lab,
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
  posts on Piazza or to staff members. However, staff will not look at your
  code or comment on it. Lab/office hours these weeks are for conceptual
  questions or for questions about past assignments only, no code assistance.
  Treat these assignments like take-home exams.

  On closed collaboration assignments:
    - You cannot look at or use anyone else's code in any way.
    - You cannot discuss the assignment, even in general terms, with anyone
      other than the course staff.
    - You should expect that staff members will politely say “I won't help
      with that” if you ask a question about your algorithm or code.
    - You cannot post publicly about the assignment on Piazza or elsewhere
      online.
    - All of the examples in the open collaboration section above would be
      academic integrity violations.

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
help from staff on them, and so on. Please make use of these resources to
understand where your solution was incorrect or incomplete, and resubmit!

## <a id="grading" href="#grading">Grading</a>

Your grade will be computed from:

<ul>
  <li>50% programming assignments</li>
  <li>40% exams</li>
  <li>10% engagement</li>
</ul>

After your weighted average is calculated, letter grades will be assigned
based on the following grading scale:

<table class="table table-striped">
<tbody>
<tr align="center" padding="10">
<td>A+</td>
<td>A</td>
<td>A-</td>
<td>B+</td>
<td>B</td>
<td>B-</td>
<td>C+</td>
<td>C</td>
<td>C-</td>
<td>D, F</td>
</tr>
<tr align="center">
<td>&nbsp; >97&nbsp; </td>
<td>&nbsp; 93-96.99 &nbsp; </td>
<td>&nbsp; 90-92.99&nbsp; </td>
<td>&nbsp; 87-89.99&nbsp; </td>
<td>&nbsp; 83-86.99&nbsp; </td>
<td>&nbsp; 80-82.99&nbsp; </td>
<td>&nbsp; 77-79.99&nbsp; </td>
<td>&nbsp; 73-76.99&nbsp; </td>
<td>&nbsp; 65-72.99&nbsp; </td>
<td>&nbsp; Below 64.99&nbsp; </td>
</tr>
</tbody>
</table>

We may adjust the above scale to be more lenient (depending on the overall class performance), but we guarantee that we will
not adjust the scale to make it harder to get a better grade.
In addition, you must pass the final exam in order to pass the course.

<b>Late and Makeup Work</b> In general, work cannot be handed in late for
credit. We will drop the lowest weekly engagement score to account for
personal events and constraints that make you miss those deadlines.

Programming work that is late follows the resubmission policy in <a href="#p:grading">the programming grades section</a>.

<b>Regrades</b> Mistakes sometimes occur in grading. Once grades are posted,
we will allow a short period for you to request a fix to your grade
(announced along with the release of grades), with a clear argument for why a
mistake was made. If you don't make a request in the given period, the grade
you were initially given is final. All regrades should be made through
Gradescope's interface.

## <a id="policies" href="#policies">Policies</a>

<a id="p:research-consent"></a>
<h3>Consent to Participate in Educational Research</h3>
<h4>Investigating the Impact of Pedagogical Choices on University Student Learning and Engagement</h4>

<h5>Who is conducting the study, why you have been asked to participate, how you were selected, and what is the approximate number of participants in the study?</h5>

<p>Gabriele Wienhausen, Director of the Teaching and Learning Commons, together with her education research colleagues is conducting a research study to find out more about how pedagogical choices affect student learning and experience in the classroom. You have been asked to participate in this study because you are a student in a class that is being studied or used as a control. There will be approximately 500,000 participants in this study.</p>

<h5>Why is this study being done?</h5>

<p>The purpose of this study is to create knowledge that has the potential to improve the learning and educational experience of students at UC San Diego and beyond.</p>

<h5>What will happen to you in this study and which procedures are standard of care and which are experimental?</h5>

<p>If you agree to be in this study, the following will happen:
Your data from this class including grades, homework and exam submissions, and survey responses will be included in the analysis to determine the effectiveness of the pedagogical techniques used in this course compared to other similar courses.</p>

<h5>How much time will each study procedure take, what is your total time commitment, and how long will the study last?</h5>

<p>Your participation involves only agreeing to let us use your data in our analysis. It will require no time on your part above the time you put into this course without agreeing to the study.</p>

<h5>What risks are associated with this study?</h5>

<p>Participation in this study may involve some added risks or discomforts. These include the following:

A potential for the loss of confidentiality. We will not share your personally identifying data with people outside our research team. Data will only be kept in anonymized form for research purposes. Course data will not used for this research study until after final grades have been posted and will be rendered confidential by removing any identifiers before analysis. Your instructor will not know whether or not you are participating in this study until after final grades have been posted. Data from students who opt out of the study will be removed prior to data analysis. Research records will be kept confidential to the extent allowed by law. Research records may be reviewed by the UCSD Institutional Review Board.
Since this is an investigational study, there may be some unknown risks that are currently unforeseeable. You will be informed of any significant new findings.</p>

<h5>What are the alternatives to participating in this study?</h5>

<p>The alternatives to participation in this study are not to participate. If you choose to opt-out of participating in this research study, we will exclude your data from analysis. Whether you participate will have no impact on your experience or grade in the associated class as the professor will not know who is or is not participating in the study until after final grades are assigned.</p>

<h5>What benefits can be reasonably expected?</h5>

<p>There is no direct benefit to you for participating in the study. The investigator, however, may learn more about how to improve student learning, and society may benefit from this knowledge.</p>

<h5>Can you choose to not participate or withdraw from the study without penalty or loss of benefits?</h5>

<p>Participation in research is entirely voluntary. You may refuse to participate or withdraw or refuse to answer specific questions in an interview or on a questionnaire at any time without penalty or loss of benefits to which you are entitled. If you decide that you no longer wish to continue in this study before the end of the quarter, simply respond to the online opt-out form here: <a href="https://goo.gl/forms/JSBRjEmkES6W6xYc2" target="_blank">https://goo.gl/forms/JSBRjEmkES6W6xYc2</a>. If you decide to opt out after the quarter has ended, you must contact Ying Xiong (yix184@ucsd.edu) and give the quarter and the course from which you would like your data withdrawn.

You will be told if any important new information is found during the course of this study that may affect your wanting to continue.
</p>

<h5>Can you be withdrawn from the study without your consent?</h5>

<p>The PI may remove you from the study without your consent if the PI feels it is in your best interest or the best interest of the study. You may also be withdrawn from the study if you do not follow the instructions given you by the study personnel.</p>

<h5>Will you be compensated for participating in this study?</h5>

<p>You will not be compensated for participating in this study.</p>

<h5>Are there any costs associated with participating in this study?</h5>

<p>There will be no cost to you for participating in this study.</p>

<h5>Who can you call if you have questions?</h5>

<p>Gabriele Wienhausen and/or her colleague has explained this study to you and answered your questions. If you have other questions or research-related problems, you may reach Gabriele Wienhausen at gwienhausen@ucsd.edu or (858) 534-3958.

You may call the Human Research Protections Program Office at 858-246-HRPP (858-246-4777) to inquire about your rights as a research subject or to report research-related problems.</p>

<h5>Your Consent</h5>

<p>If you consent to participate in this study and are at least 18 years old, no action is needed. If you DO NOT consent to participate in this study, or you choose to opt-out at any time during the quarter, please submit this form online at <a href="https://goo.gl/forms/JSBRjEmkES6W6xYc2" target="_blank">https://goo.gl/forms/JSBRjEmkES6W6xYc2</a>. Your instructor will not have access to the list of students who opted out until after grades are posted. Note that you must separately opt-out of the study for each course involved in this study.</p>

<a id = "p:ucsdsupport"></a>

## Student Resources and Support

### IDEA Engineering Student Center
The IDEA Engineering Student Center, located just off the lobby of Jacobs Hall, is a hub for student engagement, academic enrichment, personal/professional development, leadership, community involvement, and a respectful learning environment for all.  The Center offers a variety of programs, listed in the IDEA Center Facebook page at <a href="http://www.facebook.com/ucsdidea/" target="_blank">http://www.facebook.com/ucsdidea</a> (you are welcome to Like this page!) and the Center web site at <a href="http://idea.ucsd.edu/" target="_blank">http://idea.ucsd.edu/</a>.  The IDEA Center programs support both undergraduate students and graduate students.


### Diversity and inclusion

We are committed to fostering a learning environment for this course that supports a diversity of thoughts,
perspectives and experiences, and respects your identities (including race, ethnicity, heritage, gender, sex, class,
sexuality, religion, ability, age, educational background, etc.).  Our goal is to create a diverse
and inclusive learning environment where all students feel comfortable and can thrive.

Our instructional staff will make a concerted effort to be welcoming and inclusive to the wide
diversity of students in this course.  If there is a way we can make you feel more included please
let one of the course staff know, either in person, via email/discussion board, or even in a note under
the door.  Our learning about diverse perspectives and identities is an ongoing process, and we
welcome your perspectives and input.


The Office for the Prevention of Harassment & Discrimination (OPHD) provides assistance to students, faculty, and staff
regarding reports of bias, harassment, and discrimination. OPHD is the UC San Diego Title IX office. Title IX of the Education
Amendments of 1972 is the federal law that prohibits sex discrimination in educational institutions that are recipients of
federal funds. All students have the right to an educational environment that is free from harassment and discrimination.

Students have options for reporting incidents of sexual violence and sexual harassment. Sexual violence includes sexual
assault, dating violence, domestic violence, and stalking. Information about reporting options may be obtained at OPHD at
(858) 534-8298, ophd@ucsd.edu or <a href="http://ophd.ucsd.edu" target="_blank">http://ophd.ucsd.edu</a>. Students may receive confidential assistance at CARE at the Sexual
Assault Resource Center at (858) 534-5793, sarc@ucsd.edu or <a href="http://care.ucsd.edu" target="_blank">http://care.ucsd.edu</a> or Counseling and Psychological Services
(CAPS) at (858) 534-3755 or <a href="http://caps.ucsd.edu" target="_blank">http://caps.ucsd.edu</a>.

Students may feel more comfortable discussing their particular concern with a trusted employee. This may be a student affairs
staff member, a department Chair, a faculty member or other University official. These individuals have an obligation to
report incidents of sexual violence and sexual harassment to OPHD. This does not necessarily mean that a formal complaint will
be filed.

If you find yourself in an uncomfortable situation, ask for help.


### Students with Disabilities

We aim to create an environment in which all students can succeed in this course.  
If you have a disability, please contact the
<a href="https://disabilities.ucsd.edu/about/index.html" target="_blank">
Office for Students with Disability (OSD)</a>,
which is located in University Center 202 behind Center Hall, to discuss appropriate accommodations
right away.  We will work to provide you with the accommodations you need,
but you must first provide a current Authorization for Accommodation (AFA) letter issued by the OSD.  
You are required to present your AFA letters to Faculty (please make arrangements to contact me privately)
and to the OSD Liaison in the CSE department in advance so that accommodations may be arranged.
