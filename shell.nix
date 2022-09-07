let
  pkgs = import <nixpkgs> {};

in pkgs.mkShell rec {
  name = "discode-env";
  buildInputs = with pkgs; [ git jdk jre gradle ];
  shellHook = ''
    export PS1='\n\[\033[1;34m\][${name}:\w]\$\[\033[0m\] '
  '';
}
