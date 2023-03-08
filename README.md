# Swift Views Parser (TP1)

## About this

This program is a parser for a reduced structure defined with the sytax described in the [statement](/statement.pdf) file. The production rules are in EBNF grammar are on the [production-rules](/production-rules.pdf) file.

## Technologies

- Java
- JavaCC

## Respository files

  The important files are:

- [SwiftViews.jj](/src/lym/languages/SwiftViews.jj): this is the main file and contains the parser code.
- [examples](/examples): this folder contains examples of valid codes.

## Execution

<ol>
<li>Create a new java project on Eclipse</li>
<li>Copy the files of this repository on the project created</li>
<li>Open the [ConsolaParsers.java](/src/lym/interfaz/ConsolaParsers.java) file and execute it</li>
<li>Write code on the bottom section of the interface and click on the *Enviar* button</li>
<li>If  the input was a valid program, the interface will return *OK*</li>
</ol>
