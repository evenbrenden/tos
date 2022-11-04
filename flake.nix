{
  description = "Tour of Scala";
  inputs.nixpkgs.url = "nixpkgs/nixos-22.05";
  outputs = { self, nixpkgs }:
    let
      pkgs = import nixpkgs { inherit system; };
      system = "x86_64-linux";
    in {
      devShells.${system} = {
        default = pkgs.mkShell { buildInputs = with pkgs; [ sbt ]; };
      };
    };
}
