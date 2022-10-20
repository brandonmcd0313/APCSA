using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Ball : MonoBehaviour {

    AudioSource aud;
    AudioSource aud2;
    public AudioClip hitSound;
    public AudioClip hexSound;

    // Use this for initialization
    void Start () {
		aud = GetComponent<AudioSource>(); //hook up aud
        aud2 = GetComponent<AudioSource>(); //hook up aud2
    }

    // Update is called once per frame
    void Update() {
    }


    //every frame we hold the mouse down over this object
    private void OnMouseOver()
    {
        //left click - kill the ball
        if (Input.GetMouseButtonDown(0))
            Destroy(this.gameObject);

        //right click - throw the ball in a random direction
        // -2 to 2 scale on every axis
        if (Input.GetMouseButtonDown(1))
        {
            float xPos = Random.Range(-2f, 2f);
            float yPos = Random.Range(-2f, 2f);
            float zPos = Random.Range(-2f, 2f);

            this.gameObject.transform.position +=
                new Vector3(xPos, yPos, zPos);
        }

        //middle click - clone THIS ball
        if (Input.GetMouseButtonDown(2))
        {
            Vector3 locate = transform.position;
            Instantiate(this.gameObject, locate,
                Quaternion.identity);
            GameObject.Find("World Manager").
                    GetComponent<WorldManager>().
                    increaseBall();
        }
    }

    //method that runs when we hit something
    private void OnCollisionEnter(Collision other)
    {
        //if we hit a landing zone
        if(other.gameObject.tag == "Landing")
        {

            //play sound effect
            aud.PlayOneShot(hitSound);

            
        }

        if (other.gameObject.tag == "Hex")
        {
            //randomize the color of the platform
            other.gameObject.GetComponent<MeshRenderer>().material.
                color = new Color(Random.Range(0, 1f),
                Random.Range(0, 1f), Random.Range(0, 1f));

            //play sound effect
            aud2.PlayOneShot(hexSound);


        }


    }
    //runs when hits a trigger zone
    void OnTriggerEnter(Collider other)
    {
        if(other.tag == "Fall Zone")
        {
            Destroy(gameObject); //ks
        }

        if(other.tag == "Counter")
        {
            //call apropriate method from world manager
            if (other.gameObject.name == "counter1")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(1);
            }
            else if (other.gameObject.name == "counter2")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(2);
            }
            else if (other.gameObject.name == "counter3")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(3);
            }
            else if (other.gameObject.name == "counter4")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(4);
            }
            else if (other.gameObject.name == "counter5")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(5);
            }
            else if (other.gameObject.name == "counter6")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(6);
            }
            else if (other.gameObject.name == "counter7")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(7);
            }
            else if (other.gameObject.name == "counter8")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(8);
            }
            else if (other.gameObject.name == "counter9")
            {
                GameObject.Find("World Manager").
                    GetComponent<WorldManager>().zoneHit(9);
            }
        }
    }
}
