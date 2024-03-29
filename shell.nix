{ pkgs ? import <nixpkgs> {  } }:
with pkgs;
mkShell {
  buildInputs = [ git jdk jre gradle ];
  shellHook = ''
    export PS1='\n\[\033[1;34m\][discode-env:\w]\$\[\033[0m\] '
  '';
}
