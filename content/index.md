:page/uri /
:page/body

# Introduction

Auto Timesheet is a free, and open source CLI application for automating the maintenance of timesheets. It allows you to clock in, and out just by typing commands into the terminal:

```sh
> auto-timesheet clockin
Clocked in.
> auto-timesheet clockout
Clocked out. You have worked 3 hours, 15 minutes
> auto-timesheet report
Thursday (3 hours, 0 minutes):
09:00-12:00 (3 hours, 0 minutes)
Friday (4 hours, 0 minutes):
08:00-12:00 (4 hours, 0 minutes)
Saturday (0 hours, 0 minutes):
13:00-16:15 (3 hours, 15 minutes)
Total work completed: 10 hours, 15 minutes
```

The application is backed by an SQLite database. When you clock in, it doesn't start a timer; it **simply creates an entry in the database**. This means you don't need to keep the application open, and you can safely reboot without losing any information.

## Installation

Auto Timesheet is a Clojure application which can be compiled into a native image using GraalVM, which has minimal dependencies. It'll work fine across Windows, Mac, and Linux.

Currently, its packaged in Brew, so if you have that installed on either Linux, or Mac, you can just run

```sh
brew tap jamescrake-merani/tap
brew install auto-timesheet
```

Building from source should be fairly easy as well. You'll need Clojure, and a JVM with GraalVM native image. For more information, see the [README file](https://github.com/jamescrake-merani/auto-timesheet/blob/master/README.md) in the repo.
