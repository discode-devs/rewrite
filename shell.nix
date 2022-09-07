{ pkgs ? import <nixpkgs> {  } };
with pkgs;
mkShell {
  name = "discode-env";
  buildInputs = [ git jdk jre gradle ];
  shellHook = ''
    export PS1='\n\[\033[1;34m\][${name}:\w]\$\[\033[0m\] '
  '';
}
