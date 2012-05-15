build script examples
=====================

check out the example code to your local environment:

    git clone git://github.com/flanker/build-script-examples.git

**TESTED in Ubuntu 10.04 and Mac OS X 10.7**

### [Apache Buildr](http://buildr.apache.org/):

code in [build-script-examples/buildr/one](https://github.com/flanker/build-script-examples/tree/master/buildr/one)

`one` is a java based project which uses Apache Buildr as its build script. To try it yourself:

* first you need install jdk: (if you have jdk installed, then skip this step)

        sudo apt-get install openjdk-6-jdk

* install `buildr`:

        sudo gem install buildr

* open a shell and go to directory `CODE/buildr/one`

* to compile project, run the tests and package them into jar/war, just run:

        buildr one:web:package

    this command will download the required library and compile the source code, run junit test, then package the `library` module into a `jar` file and package `web` module into a `war` file.


* to run the web server, run:

        buildr one:web:run

    this command will run the web server. you can see the result at `http://localhost:8080/`

